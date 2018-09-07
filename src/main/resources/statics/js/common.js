

var common = {
    baseUrl:"http://192.168.1.56:8080",
    log: function (msg) {
        console.log(msg);
    },
    get: function (url,params,resFunc) {
        // var loadingIndex;
        Vue.http.get(common.baseUrl + url,{
            headers:{
                auth_token:localStorage.getItem("auth_token"),
            },
            params:params,
            before: function () {
                // loadingIndex = layer.open({type: 2});
                console.log("调用服务之前。。。");
            },
            emulateJSON:true
        }).then(function (result) {
            // 通过 result.body 拿到服务器返回的成功的数据

            // layer.close(loadingIndex);
            resFunc(result.body)
        }).catch(function (response) {
            common.log(response);
            if (response.body.status == 100010){
                window.location.href = common.baseUrl + "/statics/login.html";
            }else{

                alert(response.body.msg)
            }
        })
    },
    post:function (url,params,resFunc) {
        // var loadingIndex;
        Vue.http.post(common.baseUrl + url,JSON.stringify(params),{
            headers:{
                auth_token:localStorage.getItem("auth_token"),
            },
            before: function () {
                // loadingIndex = layer.open({type: 2});
                console.log("调用服务之前。。。");
            },
            emulateJSON:true
        }).then(function (result) {
            // 通过 result.body 拿到服务器返回的成功的数据
            // layer.close(loadingIndex);
            resFunc(result.body)
        }).catch(function (response) {
            common.log(response)
        })

    }

}

