function sorting() {
    var mainlist = document.getElementById('sorting_list');
    var sublist = mainlist.getElementsByTagName('li');
    var check = new Array();
    for (var i = 0; i < sublist.length; i++) {
        check.push(sublist[i].innerText)
    }
    var check1 = new Array();
    check1 = check.sort();
    for (var i = 0; i < sublist.length; i++) {
        sublist[i].innerText = check1[i];
    }
}
function suggest() {
    var mainlist = document.getElementById('usernamelist');
    var sublist = mainlist.getElementsByTagName('li');
    var username = document.getElementById("username").value;
    var check = ["priya", "kayal", "haara","bala","abian","client","dance","spring","java","jofin"];
    var regex = new RegExp(".*" + username + ".*");
    console.log(regex);
    var display = "<ul>"
    for (var i = 0; i < check.length; i++) {
        if (regex.test(check[i]) == true) {
            display += "<li>" + check[i] + "</li>";
            console.log(sublist[i]);
        }
    }
    display += "</ul>";
    console.log(display);
    mainlist.innerHTML = display;
}