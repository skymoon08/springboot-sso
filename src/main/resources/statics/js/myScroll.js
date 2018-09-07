


(function(win, $) {


    var myScroll,
        pullDown = $("#pullDown"),
        pullUp = $("#pullUp"),
        pullDownLabel = $(".pullDownLabel"),
        pullUpLabel = $(".pullUpLabel"),
        container = $('#container'),
        loadingStep = 0; //加载状态0默认，1显示加载状态，2执行加载数据，只有当为0时才能再次加载，这是防止过快拉动刷新


    win.loadScroll = function(pullUpAction,pullDownAction) {

        var windowH = $(window).height();
        var titHeight = $('#header').height();
        var footer = $('#footer').height();
        var contentH = windowH - titHeight ;
        var contentHfooter = windowH - titHeight-footer;
        if ($("#container").height()<contentHfooter) {
            $("#container").css({
                'min-height':contentHfooter
            })
        }



        pullDown.hide();
        pullUp.hide();

        myScroll = new IScroll("#wrapper", {
            scrollbars: true,
            mouseWheel: false,
            interactiveScrollbars: true,
            shrinkScrollbars: 'scale',
            fadeScrollbars: true,
            scrollY: true,
            probeType: 2,
            bindToWrapper: true,
            click: true,
            taps:true
        });
        myScroll.on("scroll", function() {
            if(loadingStep == 0 && !pullDown.attr("class").match('refresh|loading') && !pullUp.attr("class").match('refresh')) {
                if(this.y > 40) { //下拉刷新操作

                    $(".pulldown-tips").hide();
                    pullDown.addClass("refresh").show();
                    pullDownLabel.text("松手刷新数据");
                    loadingStep = 1;
                    myScroll.refresh();

                } else if(this.y < (this.maxScrollY - 50)) { //上拉加载更多
                    pullUp.addClass("refresh").show();
                    pullUpLabel.text("正在载入");
                    loadingStep = 1;
                    pullUpAction();
                }
            }
        });
        myScroll.on("scrollEnd", function() {
            if(loadingStep == 1) {
                if(pullDown.attr("class").match("refresh")) { //下拉刷新操作
                    pullDown.removeClass("refresh").addClass("loading");
                    pullDownLabel.text("正在刷新");
                    loadingStep = 2;
                    pullDownAction();
                }
            }
        });


        win.upRefreshScroll = function(){
            pullUp.attr('class', '').hide();
            myScroll.refresh();
            loadingStep = 0;
        };

        win.downRefreshScroll = function () {
            pullDown.attr('class', '').hide();
            myScroll.refresh();
            loadingStep = 0;
            $(".pulldown-tips").show();
        }

        win.refreshScroll = function(){
            pullUp.attr('class', '').hide();

            pullDown.attr('class', '').hide();
            $(".pulldown-tips").show();
            loadingStep = 0;
            myScroll.refresh();
        }

        document.addEventListener('touchmove', function(e) { e.preventDefault(); }, false);
    }

})(window, Zepto)
