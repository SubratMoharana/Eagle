import { Component, OnInit } from '@angular/core'
import { NSNetworkDataV2 } from '../../models/network-v2.model'
import { FormControl } from '@angular/forms'
import { ActivatedRoute } from '@angular/router'

@Component({
  selector: 'ws-app-network-connection-requests',
  templateUrl: './network-connection-requests.component.html',
  styleUrls: ['./network-connection-requests.component.scss'],
  /* tslint:disable */
  host: { class: 'flex flex-1 mt-6 ' },
  /* tslint:enable */
})
export class NetworkConnectionRequestsComponent implements OnInit {
  data!: NSNetworkDataV2.INetworkUser[]
  queryControl = new FormControl('')
  currentFilter = 'timestamp'
  currentFilterSort = 'desc'
  constructor(
    private route: ActivatedRoute,
  ) {
    this.data = this.route.snapshot.data.connectionRequests.data.result.data
   }

  ngOnInit() {
  }

  updateQuery(key: string) {
    if (key) {

    }
  }

  filter(key: string, order: string | 'asc' | 'desc') {
    if (key) {
      this.currentFilter = key
      this.currentFilterSort = order
    }
  }

}
