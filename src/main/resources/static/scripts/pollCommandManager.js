
function sendData(){
    var data = {
        commandKey: $("#poll-name").val(),
        voteFor: $("#poll-vote").val(),
        success: $("#poll-success").val(),
        failure: $("#poll-failure").val(),
        duration: $("#poll-duration").val()
    };
    console.log(data);

    $.ajax({
        url: 'http://localhost:8080/manage/poll/add',
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