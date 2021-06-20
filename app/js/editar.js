let id_receita = GetURLParameter("id");

$(document).ready(function(){
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },

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
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
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
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
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
            alert("Ocorreu um erro ao editar receita");
        }
    });

});

/*Despesa*/
let id_despesa = GetURLParameter("id");

$(document).ready(function(){
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        url: 'http://localhost:8080/api/despesa/get/' + id_despesa,
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $("#input_nome_despesa").val(data.nome_despesa);
            $("#input_valor_despesa").val(data.valor_despesa);
            $("#input_descricao_despesa").val(data.descricao_despesa);
        }
    })

});


$('#form-editar-despesa').submit(function (event) {
    event.preventDefault();


    //Editar receita
    var formData = {
        'id': id_despesa,
        'nome_despesa': $('#input_nome_despesa').val(),
        'valor_despesa': $('#input_valor_despesa').val(),
        'descricao_despesa': $('#input_descricao_despesa').val()

    };

    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        type: 'PUT',
        url: 'http://localhost:8080/api/despesa/editar',
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function (data) {
            location.href = '../Usuario/despesa.html';
        },
        error: function(data){
            alert("Ocorreu um erro ao editar despesa");
        }
    });

});
