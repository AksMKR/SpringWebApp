$(function () {
    $("#loginButton").click(function () {
        var username = document.getElementById("userText").value;
        var password = document.getElementById("passwordText").value;
        var messageLabel = document.getElementById("msgLabel");

        $.post("http://localhost:8090/validate", {"username": username, "password": password}, function (data) {
            alert(data);
        });
        /*$.ajax({
            type: "POST",
            url: "http://localhost:8090/validate",
            data: {"username": username, "password": password},
            dataType: "json",
            success: function (data) {
                if (data.status === true) {
                    alert("Data: " + data.status);
                    $(location).attr('href', "http://localhost:8090/");
                } else {
                    messageLabel.innerHTML = "Username and/or Password Incorrect";
                }
            }
        })
        ;*/
    });
});