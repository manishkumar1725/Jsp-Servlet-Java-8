package com.manish.cart;

import com.manish.cart.FashionDAO;;

public interface DAOUtility {

public static IfashionDAO getCartDao()
{
	return  new FashionDAO();
}

}
