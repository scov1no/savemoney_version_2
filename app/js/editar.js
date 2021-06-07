let id_receita = GetURLParameter("id");

$(document).ready(function(){
    $.ajax({

        url: 'http://localhost:8080/api/receita/get/' + id_receita,
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $("#input_nome_receita").val(data.nome_receita);
            $("#input_valor_receita").val(data.valor_receita);
            $("#input_descricao_receita").val(data.descricao_receita);
        }
    })

});


$('#form-editar').submit(function (event) {
    event.preventDefault();


    //Editar receita
    var formData = {
        'id': id_receita,
        'nome_receita': $('#input_nome_receita').val(),
        'valor_receita': $('#input_valor_receita').val(),
        'descricao_receita': $('#input_descricao_receita').val()

    };

    $.ajax({
        headers: {

            'Accept': 'application/json',
            'Content-Type': 'application/json',
            },
        type: 'PUT',
        url: 'http://localhost:8080/api/receita/editar',
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function (data) {
            location.href = '../Usuario/receita.html';
        },
        error: function(data){
            alert("Ocorreu um erro ao editar aluno");
        }
    });

});

