import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Task } from '../model/Task';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {

  constructor(
    private http: HttpClient
  ) { }

  postTask(task: Task): Observable<Task> {
    return this.http.post<Task>('http://localhost:8083/api/task/add', task)
  }
}
