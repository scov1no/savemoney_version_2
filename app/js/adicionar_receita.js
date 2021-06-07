//Processar Formulario

$(document).ready(function() {
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
                'Accept': 'application/json',
                'Content-Type': 'application/json'
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

