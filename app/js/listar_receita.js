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
                html += '<td><a href="#" onclick="removerReceita(' + data.id +')"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-recycle" viewBox="0 0 16 16">\n' + '  <path d="M9.302 1.256a1.5 1.5 0 0 0-2.604 0l-1.704 2.98a.5.5 0 0 0 .869.497l1.703-2.981a.5.5 0 0 1 .868 0l2.54 4.444-1.256-.337a.5.5 0 1 0-.26.966l2.415.647a.5.5 0 0 0 .613-.353l.647-2.415a.5.5 0 1 0-.966-.259l-.333 1.242-2.532-4.431zM2.973 7.773l-1.255.337a.5.5 0 1 1-.26-.966l2.416-.647a.5.5 0 0 1 .612.353l.647 2.415a.5.5 0 0 1-.966.259l-.333-1.242-2.545 4.454a.5.5 0 0 0 .434.748H5a.5.5 0 0 1 0 1H1.723A1.5 1.5 0 0 1 .421 12.24l2.552-4.467zm10.89 1.463a.5.5 0 1 0-.868.496l1.716 3.004a.5.5 0 0 1-.434.748h-5.57l.647-.646a.5.5 0 1 0-.708-.707l-1.5 1.5a.498.498 0 0 0 0 .707l1.5 1.5a.5.5 0 1 0 .708-.707l-.647-.647h5.57a1.5 1.5 0 0 0 1.302-2.244l-1.716-3.004z"/>\n' +'</svg></a>'
                html += '<a href="editar_receita.html?id=' + data.id +'"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-arrow-counterclockwise" viewBox="0 0 16 16">\n' +  '  <path fill-rule="evenodd" d="M8 3a5 5 0 1 1-4.546 2.914.5.5 0 0 0-.908-.417A6 6 0 1 0 8 2v1z"/>\n' + '  <path d="M8 4.466V.534a.25.25 0 0 0-.41-.192L5.23 2.308a.25.25 0 0 0 0 .384l2.36 1.966A.25.25 0 0 0 8 4.466z"/>\n' + '</svg></a></td></tr>';
                $("#tabela_listar_receita_tbody_1").html(html);
            });
        }
    })
});

