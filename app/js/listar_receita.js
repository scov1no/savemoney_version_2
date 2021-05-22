$(document).ready(function (){
    $.ajax({
        url:'http://localhost:8080/api/receita/listar',
        type:'get',
        dataType: 'json',
        success: function(result){
            var html = '';
            $.each(result, function (i, data){
                html += '<tr><td>' + data.id +'</td>';
                html += '<td>' + data.nome_receita +'</td>';
                html += '<td>R$ ' + data.valor_receita +'</td>';
                html += '<td>'+  data.descricao_receita +'</td>';
                html += '<td>' + data.data_receita +'</td></tr>';
                $("#tabela_listar_aluno_tbody").html(html);
            });
        }
    })
});
$(document).ready(function (){
    $.ajax({
        url:'http://localhost:8080/api/receita/listar',
        type:'get',
        dataType: 'json',
        success: function(result){
            var html = '';
            $.each(result, function (i, data){
                html += '<tr><td>' + data.nome_receita +'</td>';
                html += '<td>R$ ' + data.valor_receita +'</td></tr>';
                $("#tabela_listar_aluno_tbody_1").html(html);
            });
        }
    })
});

/*
function removerAluno(id_receita){
    var r = confirm("Cofirma a exclusão?");
    if(r == true){
        var formData = {
            "id" : id_receita,

        };
        $.ajax({
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type:'POST',
            url: 'http://localhost:8080/api/receita/remover',
            data:JSON.stringify(formData),
            dataType: 'json',
            enconde: true,
            success: function(result){
                location.reload();
            },
            erro: function(result){
                console.log(result);
            }
        })
    }

 */
