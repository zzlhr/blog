/**
 * Created by lhr on 2017/5/12.
 */



function ajax(url,data,type,callback) {
    $.ajax({
        url:url,
        type:type,
        data:data,
        success:function (data) {
            callback(data);
        },error:function (error) {
            callback(error);
        }
    })
}
