//Processar Formulario
$ ('#form-adicionar').submit(function (event){
    event.preventDefault();



    //Criar formData
    var formData = {

        'nome_despesa': $('#input_nome_despesa').val(),
        'valor_despesa': $('#input_valor_despesa').val(),
        'descricao_despesa': $('#input_descricao_despesa').val()
    };
    $.ajax({
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
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