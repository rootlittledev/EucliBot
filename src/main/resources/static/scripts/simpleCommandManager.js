
function addArgument(){
$("#command-text").val($("#command-text").val() + " %s ");
}

function sendData(){
    var data = {
        commandName: $("#command-name").val(),
        reply: $("#command-text").val()
    };
    console.log(data);

    $.ajax({
        url: 'http://localhost:8080/manage/simple/add',
        type: 'POST',
        data: JSON.stringify(data),
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        async: false,
        success: function(msg) {
            alert(msg);
        }
    });
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( document ).ready(function() {hideNotification(); });
    $("#add-argument").click(function () {
        addArgument();
    });
    $("#command-add").click(function () {
        sendData();

    });

});