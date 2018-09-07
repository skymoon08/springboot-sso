var swiperAd = null;
var vm = new Vue({
    el: '#contanter',
    data: {
        banners: [],
        mainData: {
            panicCampaignVos: [],
            hotPds:[],
            panicBuyingVisible: false,
            groupBuyVisible: false,
            showSSt:false
        },
        reloadFlg:false,
    },

    methods: {

        getAds: function () {
            //获取广告banner
            common.get("/api/home/getBanners",{aa:"123"},function (result) {
                    if(vm.reloadFlg == true){

                        result.resultData.push({
                            imgUrl: "images/w_banner01.png",
                            redirectUrl:"http://testlf.5aitou.com:88/mk/register588",
                            title:"新588"});
                        vm.banners = result.resultData;
                    }else{
                        vm.banners = result.resultData;
                    }

                    console.log(vm.banners);
            })

        },
        getMainData: function () {
            var that = this;
            common.get("/api/home/getMainData",{aa:"123"},function (result) {
                // 通过 result.body 拿到服务器返回的成功的数据
                console.log(result.resultData)

                that.mainData.groupBuyVisible = result.resultData.groupBuyVisible;

                that.showSSt = result.resultData.showSSt;

                that.mainData.hotPds = result.resultData.hotPds;

            })

        },
        getRecommendPd: function () {

        },

        jumpProductDetail: function(productCode){
            common.log(productCode);

            window.location.href = common.baseUrl + "/finance/honourProductDetail/"+productCode+".html";
        },
        reload: function () {
            vm.reloadFlg = true;
            this.getAds();
            this.getMainData();
        }
        


    },
    created: function(){
        //  在 created 中，data 和 methods 都已经被初始化好了！
        // 如果要调用 methods 中的方法，或者操作 data 中的数据，最早，只能在 created 中操作


        this.getAds();
        this.getMainData();

        common.post("/api/home/postData",{celphone:"aaa",password:"123"},function(result){

            common.log(result);
        })
    },
    updated: function () {
        // updated 事件执行的时候，页面和 data 数据已经保持同步了，都是最新的,只要有数据更新就会执行updated方法
        common.log("updated");

        downRefreshScroll();

    },
    mounted:function () {

       // 已经真实的挂载到了页面中，用户已经可以看到渲染好的页面了

        swiperAd = new Swiper('#swiperAd', {
            pagination : '.swiper-pagination',
            paginationClickable : true,
            spaceBetween : 30,
            centeredSlides : true,
            autoplay : 2500,
            observer:true,//修改swiper自己或子元素时，自动初始化swiper
            observeParents:false,//修改swiper的父元素时，自动初始化swiper
            loop:true,
            autoplayDisableOnInteraction : false,
            onTap : function(swiper){
                // var url = $($('.swiper-slide')[swiper.activeIndex]).children('input').val();
                // if(url.indexOf('/campaign/bankDeposit')){
                //     common.addCookie('bankDepositCampaign','','-1');
                // }
                // window.location.href = url;
            }
        });

        loadScroll(function pullDownAction() {
            vm.reload();

        });

    },
    filters: {
        productName: function (productName) {

            return productName + "哈哈";
        }
    }


})


