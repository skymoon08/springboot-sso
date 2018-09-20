

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
            if (response.body.status == 100010){
                window.location.href = common.baseUrl + "/statics/login.html";
            }else{

                alert(response.body.msg)
            }
        })

    }

}


Vue.filter('rate', function (rate) {

    return (rate * 100).toFixed(1);
})

Vue.filter('money', function (money) {

    return money_format(money,2, ".", ",");
})

function money_format(number, decimals, dec_point, thousands_sep) {
    /*
    * 参数说明：
    * number：要格式化的数字
    * decimals：保留几位小数
    * dec_point：小数点符号
    * thousands_sep：千分位符号
    * */
    number = (number + '').replace(/[^0-9+-Ee.]/g, '');
    var n = !isFinite(+number) ? 0 : +number,
        prec = !isFinite(+decimals) ? 0 : Math.abs(decimals),
        sep = (typeof thousands_sep === 'undefined') ? ',' : thousands_sep,
        dec = (typeof dec_point === 'undefined') ? '.' : dec_point,
        s = '',
        toFixedFix = function (n, prec) {
            var k = Math.pow(10, prec);
            return '' + Math.ceil(n * k) / k;
        };

    s = (prec ? toFixedFix(n, prec) : '' + Math.round(n)).split('.');
    var re = /(-?\d+)(\d{3})/;
    while (re.test(s[0])) {
        s[0] = s[0].replace(re, "$1" + sep + "$2");
    }

    if ((s[1] || '').length < prec) {
        s[1] = s[1] || '';
        s[1] += new Array(prec - s[1].length + 1).join('0');
    }
    return s.join(dec);
}