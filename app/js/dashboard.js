$(document).ready(function () {
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }

    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        url: 'http://localhost:8080/api/receita/listar',
        type: 'get',
        dataType: 'json',
        success: function (result) {
            $("#tabela_listar_receitas_1").html(result);
        }
    })
});