function load() {
    alert("xx ok");
}

$(function () {
    // jquery的方式 body加载完成之后 再执行这个方法
    alert("yy ok");
    // 方法的传入参数是json格式的对象
    let data = {
        username: "pppp",
        password: "1111"
    }
    $.ajax({
        type: "post", // 请求方法
        url: "data/login.json",  // url
        contentType: "application/json", //请求数据类型
        data: JSON.stringify(data), //请求数据，如果是json的数据类型，需要将json的数据转化成字符串
        success: function (r) {
            alert(JSON.stringify(r));
        },
        // 错误的话 就返回一系列的报错信息
        error: function (jqXHR, XMLHttpRequest, textStatus, errorThrown) {
            console.log("jqXHR={\n"+jqXHR.status+",\n"+jqXHR.statusText+",\n"+jqXHR.responseText
                +"},\ntextStatus="+textStatus+",\nerrorThrown="+errorThrown);
        }
    });
});