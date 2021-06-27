import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, ReplaySubject, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { environment as $ENV } from '../../../environments/environment';

@Injectable({
  providedIn: 'root',
})
export class RestApiService {
  constructor(public http: HttpClient) {}

  
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      // 'Authorization': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJydWJ5am9pc29uIiwiZXhwIjoxNTkwMDg4NDE3LCJpYXQiOjE1OTAwNzA0MTd9.akhd_-GOZkXxDHbSZxsbpU4g51Ny_OM-olJ_1ncq_vFSxT5kuNr-LpFaC7JJXwFra1wXuPp09qZ6eFjazb5ifw'
    }),
  };

  /*authenticateUser(authenticate): Observable<Authenticate> {
    return this.http
      .post<Authenticate>(`${$ENV.investorUrl}/authenticate`, JSON.stringify(authenticate), this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }*/


  // Error handling
  handleError(error :any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    // window.alert(errorMessage);
    return throwError(errorMessage);
  }
}
