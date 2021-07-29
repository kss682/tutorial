const MAX_LIMIT = 10;
let TASK_ID = 0;
let task_list = new Array();

function add_task(){
    TASK_ID++;
    console.log("hello world");
    task = document.getElementById("task").value;
    task_list.push(task);
    console.log(task_list);

    new_div = document.createElement('div');
    new_div.innerHTML = task;
    new_div.id = TASK_ID;
    new_div.className = 'task-item';

    delete_icon = document.createElement('span');
    delete_icon.className = "material-icons trash";
    delete_icon.innerHTML = "delete_forever";
    delete_icon.setAttribute("onclick", "remove_task(this.parentNode)")

    new_div.appendChild(delete_icon)

    document.getElementById('task-list').appendChild(new_div);
}

function remove_task(node){
    console.log(node);
    console.log(typeof(node.id));
    task_list.splice(Number(node.id), Number(node.id)+1);
    TASK_ID--;

    node.remove();
    console.log(task_list);
}
