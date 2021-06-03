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
                html += '<td><p>R$</p> ' + data.valor_receita +'</td>';
                html += '<td>'+  data.descricao_receita +'</td></tr>';


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
                html += '<td>R$ ' + data.valor_receita +'</td>';
                html += '<td>R$ ' + data.valor_receita +'</td></tr>';
                $("#tabela_listar_receita_tbody_1").html(html);
            });
        }
    })
});

