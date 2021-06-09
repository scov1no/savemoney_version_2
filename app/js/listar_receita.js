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
                html += '<td><a href="#" onclick="removerReceita(' + data.id +')"><img src="../view/img/trash.svg"  alt=""></a>';
                html += '<a href="../Usuario/editar_receita.html?id=' + data.id +' "><img src="../view/img/rubber.svg"  alt=""></a>';
                html += '<a href="../Usuario/view_receita.html?id=' + data.id +' "><img src="../view/img/eye.svg"  alt=""></a></td></tr>';
                $("#tabela_listar_receita_tbody_1").html(html);
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
                $("#tabela_listar_receita_tbody_2").html(html);
            });
        }
    })
});