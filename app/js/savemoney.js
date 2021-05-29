function formatDateTime(dateTime) {
    var d = new Date(dateTime),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear();
    hour = d.getHours();
    minute = d.getMinutes();


    if (month.length < 2)
        month = '0' + month;
    if (day.length < 2)
        day = '0' + day;

    if (hour.length < 2) {
        hour = '0' + hour;
    }

    if (minute.length < 2) {
        minute = '0' + minute;
    }

    dateFormated = [year, month, day].join('-');
    timeFormated = [hour, minute].join(':');

    return [dateFormated, timeFormated].join('T');
}