/**
 * zeigt die Tabelle mit den gelisteten Horrorbuechern an.
 */
function anzeige_Horror() {

    document.getElementById('tab_horror').style.display="";
    document.getElementById('horror').style.backgroundColor="rgb(63,72,204)";
    document.getElementById('tab_roman').style.display="none";
    document.getElementById('roman').style.backgroundColor="rgb(0,162,232)";
}

/**
 * zeigt die Tabelle mit den gelisteten Romanbuechern an.
 */
function anzeige_Roman() {
    document.getElementById('tab_horror').style.display="none";
    document.getElementById('horror').style.backgroundColor="rgb(0,162,232)";
    document.getElementById('tab_roman').style.display="";
    document.getElementById('roman').style.backgroundColor="rgb(63,72,204)";
}

/**
 * Die Tabelle mit dem übergebenen JSON Objekt wird angelegt.
 */
function load(json_object) {
    var i = 0;
    document.writeln("<table>" +
    "<tr>" +
    "<th>Autor</th>" +
    "<th>Titel</th>" +
    "<th>Kapitel</th>" +
    "<th>Art des Buches</th>" +
    "<th>ISBN</th>" +
    "<th>Erscheinungsjahr</th>" +
    "<th>Auflage</th>" +
    "</tr>");

    for(i=0;i<json_object.bookdata.length;i++) {
        document.writeln("<tr>" +
        "<td>"+ json_object.bookdata[i].autor+"</td>" +
        "<td>"+ json_object.bookdata[i].titel+"</td>"+
        "<td>"+ json_object.bookdata[i].kapitel+"</td>" +
        "<td>"+ json_object.bookdata[i].buchart+"</td>" +
        "<td>"+ json_object.bookdata[i].ISBN+"</td>" +
        "<td>"+ json_object.bookdata[i].erscheinungsjahr+"</td>" +
        "<td>"+ json_object.bookdata[i].auflage+"</td>" +
        "</tr>");
    }
    document.writeln("</table>");
}