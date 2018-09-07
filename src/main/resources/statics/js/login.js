var vm = new Vue({
    el: '#contanter',
    data: {
        loginParam: {

        }

    },

    methods: {

        login: function () {

            console.log(vm.loginParam)

            common.post("/login",vm.loginParam,function (result) {

               if (result.status == 0){
                   localStorage.setItem("auth_token",result.data)
                   window.location.href = common.baseUrl + "/statics/account.html";
               }else {
                   layer.open({
                       content: result.msg
                       ,btn: '我知道了'
                   });
               }


            })

        }

    },
    created: function(){
        //  在 created 中，data 和 methods 都已经被初始化好了！
        // 如果要调用 methods 中的方法，或者操作 data 中的数据，最早，只能在 created 中操作

    },
    updated: function () {
        // updated 事件执行的时候，页面和 data 数据已经保持同步了，都是最新的,只要有数据更新就会执行updated方法
        common.log("updated");


    },
    mounted:function () {

       // 已经真实的挂载到了页面中，用户已经可以看到渲染好的页面了


    }


})


