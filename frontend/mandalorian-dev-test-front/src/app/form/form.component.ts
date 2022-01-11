import { Component, OnInit } from '@angular/core';
import { TaskServiceService } from '../service/task-service.service';
import { Task } from '../model/Task';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  task: Task = new Task()

  constructor(
    private taskService: TaskServiceService
  ) { }

  ngOnInit(): void {
  }
  
  addTask() {
    this.taskService.postTask(this.task).subscribe((resp: Task) =>{
      this.task = resp
    })
  }

}
