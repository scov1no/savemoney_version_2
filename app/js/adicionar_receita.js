//Processar Formulario
$ ('#form-adicionar').submit(function (event){
    event.preventDefault();
    //Criar formData
    var formData = {'nome': $('#input-nome_receita').val(),
                    'valor': $('#input-valor_receita').val(),
                    'descricao': $('#input-descricao_receita').val()
    };

    $.ajax({
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        type: 'POST',
        url: 'http://localhost:8080/api/receita/incluir',
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function(data){
            location.href = 'receita.html';

        },
        error:function (data){
            $('#div-alert-message').prepend(data.responseText);
            $('#div-alert-message').fadeIn();
        }

    });
});

