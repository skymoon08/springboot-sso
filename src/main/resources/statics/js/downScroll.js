(function(win, $) {

    var myScroll,
        pullDown = $("#pullDown"),
        pullDownLabel = $(".pullDownLabel"),
        container = $('#container'),
        loadingStep = 0; //加载状态0默认，1显示加载状态，2执行加载数据，只有当为0时才能再次加载，这是防止过快拉动刷新


    win.loadScroll = function(pullDownAction) {

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
            if(loadingStep == 0 && !pullDown.attr("class").match('refresh|loading')) {
                if(this.y > 40) { //下拉刷新操作
                    $(".pulldown-tips").hide();
                    pullDown.addClass("refresh").show();
                    pullDownLabel.text("松手刷新数据");
                    loadingStep = 1;
                    myScroll.refresh();
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


        win.downRefreshScroll = function () {
            pullDown.attr('class', '').hide();
            myScroll.refresh();
            loadingStep = 0;
            $(".pulldown-tips").show();
        }

        win.refreshScroll = function(){
            myScroll.refresh();
        }

        document.addEventListener('touchmove', function(e) { e.preventDefault(); }, false);
    }

})(window, Zepto)
