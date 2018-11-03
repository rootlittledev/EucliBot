
var commandKey;
var commandText;
var contentUrl;
var soundUrl;
var commandCss;
var commandDuration;

var width;
var height;


function hideNotification(){
    $("#notification").hide()
}

function proceed() {
commandKey = $("#notification-name").val();
commandText = $("#notification-text").val();
contentUrl = $("#content-url").val();
soundUrl = $("#sound-url").val();
commandDuration = $("#notification-duration").val();

width = $("#content-url-width").val();
height = $("#content-url-height").val();
width = width/2;
height = height/2;

$("#notification-display-source").css(({'width' : width}));
$("#notification-display-source").css(({'height' : height}));
$("#notification").css(({'width' : width}));

$("#notification-display-text").text(commandText);
$("#notification-display-source").attr("src", contentUrl);

$("#notification").show();
$("#notification-control").show();

$("#notification-width").val(width);
$("#notification-height").val(height);
$("#notification-text-size").val(parseInt($("#notification-display-text").css( "font-size")));
}

function addArgument(){
$("#notification-text").val($("#notification-text").val() + " %s ");
}

function sendData(){
    var data = { commandKey: $("#notification-name").val(),
        text: $("#notification-text").val(),
        contentUrl : $("#content-url").val(),
        soundUrl : $("#sound-url").val(),
        type : "notification",
        commandCss:{textSize : $("#notification-text-size").val()*2,
            textColor : $("#notification-text-color").val(),
            textWidth : parseInt($("#notification").css('width'))*2,
            contentHeight : parseInt($("#notification-display-source").css('height'))*2,
            contentWidth : parseInt($("#notification-display-source").css('width'))*2,
            contentPositionH : parseInt($("#notification").css('left'))*2,
            contentPositionV : parseInt($("#notification").css('top'))*2
        },
        duration : $("#notification-duration").val()
    };
    console.log(data);

    $.ajax({
        url: 'http://localhost:8080/manage/notification/add',
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
    $( document ).ready(function() {hideNotification(); $("#notification-control").hide()});
    $("#add-argument").click(function () {
        addArgument();
    });
    $("#next").click(function () {
        proceed();
    });
    $("#notification-add").click(function () {
        sendData();

    });

    $("#notification").draggable( {
        containment: '#display-snippet',
        cursor: 'move',
        snap: '#display-snippet'
    } );

    $("#notification-width").change(function () {
        $("#notification-display-source").css(({'width': $("#notification-width").val()}))
        $("#notification-display-text").css("width", $("#notification-width").val());
    });
    $("#notification-height").change(function () {
        $("#notification-display-source").css(({'height': $("#notification-height").val()}))
    });
    $("#notification-text-size").change(function () {
        console.log($("#notification-text-size").val());
        $("#notification-display-text").css( "font-size", $("#notification-text-size").val() + "px" );
    });
    $("#notification-text-color").change(function () {
        $("#notification-display-text").css("color", $("#notification-text-color").val());
    });
});