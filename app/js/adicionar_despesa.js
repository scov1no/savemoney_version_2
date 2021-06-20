//Processar Formulario
$ ('#form-adicionar').submit(function (event){
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    event.preventDefault();



    //Criar formData
    var formData = {

        'nome_despesa': $('#input_nome_despesa').val(),
        'valor_despesa': $('#input_valor_despesa').val(),
        'descricao_despesa': $('#input_descricao_despesa').val()
    };

    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        type: 'POST',
        url: 'http://localhost:8080/api/despesa/incluir',
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function(data){
            location.href = 'despesa.html';

        },
        error:function (data){
            $('#div-alert-message').prepend(data.responseText);
            $('#div-alert-message').fadeIn();
        }

    });
});