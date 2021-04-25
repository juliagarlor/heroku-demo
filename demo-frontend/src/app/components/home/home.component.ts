import { Component, OnInit } from '@angular/core';
import { BackendServiceService } from 'src/app/services/backend-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  greeting: string = '';
  greetings: {id: number, greetingWords: string}[] = [];

  constructor(
    private backendService: BackendServiceService
  ) { }

  ngOnInit(): void {
    this.backendService.getAllGreetings().subscribe(data => {
      data.forEach(greeting => {
        this.greetings.push({id: greeting.id, greetingWords: greeting.greetingWords});
      });
    })
  }

  addNew(): void{
    this.backendService.newGreeting(this.greeting).subscribe(data => {
      this.greetings.push({id: data.id, greetingWords: data.greetingWords});
      this.greeting = '';
    });
  }
}
