import React, { useEffect, useState } from 'react';
import "./RightSide.css";
import Product from './Product';
import { Link } from 'react-router-dom';

function RightSidePanel(props) {
    
    const [listOfProduct,setListOfProducts] = useState([]);

    useEffect(()=>{
        //api call
        let list =[
            { id: 123456543, name : "Iphone10", rating: "34565", price: "4534", image:"https://ik.imagekit.io/amazonClone123/amazon-image/71w3oJ7aWyL._AC_UL640_FMwebp_QL65_.webp?ik-sdk-version=javascript-1.4.3&updatedAt=1670418642682"},
            { id: 54342265, name : "Iphone11", rating: "656", price:"76543456", image:"https://ik.imagekit.io/amazonClone123/amazon-image/71i2XhHU3pL._AC_UL640_FMwebp_QL65_.webp?ik-sdk-version=javascript-1.4.3&updatedAt=1670418670738"},
            { id: 123453456543, name : "Iphone12", rating: "8754", price:"76543", image:"https://ik.imagekit.io/amazonClone123/amazon-image/51PuFBgBK4L._AC_UL640_FMwebp_QL65___1_.webp?ik-sdk-version=javascript-1.4.3&updatedAt=1670418670862"},
            { id: 12344545456543, name : "Iphone13", rating: "344574367565", price:"637357", image:"https://ik.imagekit.io/amazonClone123/amazon-image/61PDbUd1VaL._AC_UL640_FMwebp_QL65_.webp?ik-sdk-version=javascript-1.4.3&updatedAt=1670418670808"},
            { id: 123465656543, name : "Iphone12", rating: "8754", price:"76543", image:"https://ik.imagekit.io/amazonClone123/amazon-image/71LRBr1aLNS._AC_UL640_FMwebp_QL65_.webp?ik-sdk-version=javascript-1.4.3&updatedAt=1670418670589"},
            { id: 2356346363, name : "Iphone13", rating: "344574367565", price:"637357", image:"https://ik.imagekit.io/amazonClone123/amazon-image/61PDbUd1VaL._AC_UL640_FMwebp_QL65_.webp?ik-sdk-version=javascript-1.4.3&updatedAt=1670418670808"}
    
        ]
        
        setListOfProducts(list);
    },[]);

    return (
        <div className="RightSide__main">
            {   
                listOfProduct.map ( (item) =>(
                    <Link to={`/order/`+item.id } >
                        <Product definition={item} />
                    </Link>
                ))
            }

        </div>
    );
}

export default RightSidePanel;