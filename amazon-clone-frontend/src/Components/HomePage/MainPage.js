import React, { Component } from 'react'
import AdvertisementFour from './AdvertisementFour/AdvertisementFour';
import AdvertisementOne from './AdvertisementOne/AdvertisementOne';
import "./MainPage.css"
class MainPage extends Component {
    constructor(props) {
        super(props);
        this.state = {}
    }
    render() {
        return (
            <div className='mainpage'>
                <div style={{ paddingTop: "260px", display: "flex", flexWrap: "wrap"}}>
                    <AdvertisementOne />
                    <AdvertisementFour />
                    <AdvertisementOne />
                    <AdvertisementOne />
                    <AdvertisementOne />
                    <AdvertisementFour />
                    <AdvertisementFour />
                    <AdvertisementOne />
                </div>
            </div>
        );
    }
}

export default MainPage;