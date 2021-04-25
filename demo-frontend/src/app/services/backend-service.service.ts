import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { from, Observable } from 'rxjs';
import { environment } from 'src/environments/environment'

@Injectable({
  providedIn: 'root'
})
export class BackendServiceService {

  baseUrl: string = environment.baseUrl;

  constructor(
    private httpClient: HttpClient
  ) { }

  getAllGreetings(): Observable<IncomingGreetings[]>{
    return this.httpClient.get<IncomingGreetings[]>(this.baseUrl + 'greetings');
  }

  newGreeting(newHello: string): Observable<IncomingGreetings>{
    return this.httpClient.post<IncomingGreetings>(this.baseUrl + 'greeting', newHello);
  }
}

interface IncomingGreetings{
  id: number;
  greetingWords: string;
}
