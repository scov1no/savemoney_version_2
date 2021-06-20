function removerReceita(id_receita) {
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    var r = confirm("Confirma a exclusão?");
    if (r == true) {

        var formData = {
            'id': id_receita,
        };

        $.ajax({
            headers: {
                'Content-Type': 'application/json',
                'Authorization': 'Beaver ' + $.cookie('jwt_token'),
            },
            type: 'POST',
            url: 'http://localhost:8080/api/receita/remover',
            data: JSON.stringify(formData),
            dataType: 'json',
            encode: true,
            success: function (result) {
                location.reload();
            },
            error: function (result) {
                console.log(result);
            }
        })

    }

}
function removerDespesa(id_despesa) {
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    var r = confirm("Confirma a exclusão?");
    if (r == true) {

        var formData = {
            'id': id_despesa,
        };

        $.ajax({
            headers: {
                'Content-Type': 'application/json',
                'Authorization': 'Beaver ' + $.cookie('jwt_token'),
            },
            type: 'POST',
            url: 'http://localhost:8080/api/despesa/remover',
            data: JSON.stringify(formData),
            dataType: 'json',
            encode: true,
            success: function (result) {
                location.reload();
            },
            error: function (result) {
                console.log(result);
            }
        })

    }

}