//Processar Formulario

$(document).ready(function() {
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    $('#form-adicionar').submit(function (event) {
        event.preventDefault();


        //Criar formData
        var formData = {

            'nome_receita': $('#input_nome_receita').val(),
            'valor_receita': $('#input_valor_receita').val(),
            'descricao_receita': $('#input_descricao_receita').val()
        };

        $.ajax({
            headers: {
                'Content-Type': 'application/json',
                'Authorization': 'Beaver ' + $.cookie('jwt_token'),
            },
            type: 'POST',
            url: 'http://localhost:8080/api/receita/incluir',
            data: JSON.stringify(formData),
            dataType: 'json',
            encode: true,
            success: function (data) {
                location.href = '../Usuario/receita.html';

            },
            error: function (data) {
                $('#div-alert-message').prepend(data.responseText);
                $('#div-alert-message').fadeIn();
            }

        });
    });

});

