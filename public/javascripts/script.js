$(document).ready(function() {
    $("button").click(function() {
        var msg = $("#txtMsg").val();

        if (msg) {
            $.ajax({
                type: "POST",
                url: "nlp",
                data: msg,
                contentType: "text/plain",
                success: function(msg) {
                    $("#result").html(msg);
                }
            });
        }
    })
});