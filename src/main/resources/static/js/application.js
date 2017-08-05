$(function () {
    $("#loginButton").click(function () {
        var username = document.getElementById("userText").value;
        var password = document.getElementById("passwordText").value;
        var messageLabel = document.getElementById("msgLabel");

        $.ajax({
            url: "http://localhost:8090/validate",
            type: "POST",
            data: JSON.stringify({username: username, password: password}),
            contentType: "application/json",
            dataType: "json",
            success: function (data) {
                if (data.status === true) {
                    $(location).attr('href', "http://localhost:8090/");
                } else {
                    messageLabel.innerHTML = "Username and/or Password Incorrect";
                }
            }
        });
    });
});