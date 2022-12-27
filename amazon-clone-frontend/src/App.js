import './App.css';
import MainPage from './Components/HomePage/MainPage';
import NavBar from './Components/NavBar/Navigation';
import DisplayContent from './Components/DisplayContent/DisplayContent';
import PlaceOrder from './Components/PlaceOrder/PlaceOrder';
import Checkout from './Components/Checkout/Checkout';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import CartContextProvider from './Components/CartContext';

function App() {
	return (
		<Router>
		<div className="App">
			<CartContextProvider >
				<NavBar />
				<Routes>
					<Route exact path="/" element =  {<MainPage />}></Route>
					<Route path="/display" element =  {<DisplayContent />}></Route>
					<Route path="/order/:id" element = {<PlaceOrder />}></Route>
					<Route path="/checkout" element = {<Checkout />}></Route>
				</Routes>
			</CartContextProvider >
		</div>
    </Router>
	);
}

export default App;
