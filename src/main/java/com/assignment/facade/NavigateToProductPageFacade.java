package com.assignment.facade;

import com.assignment.pages.ProductsDisplayPage;
import com.assignment.pages.pagecomponents.MenuComponent;

public final class NavigateToProductPageFacade {
    private MenuComponent menucomponent;
    private ProductsDisplayPage productdisplayPage;

    public NavigateToProductPageFacade(){

        menucomponent = new MenuComponent();
        productdisplayPage = new ProductsDisplayPage();

    }

    public NavigateToProductPageFacade navigateToMenuAndSubMenu(String mainMenuItem, String subMenuItem)
    {
        menucomponent.clickHambugerMenu();
        menucomponent.selectMainMenuSection(mainMenuItem);
        menucomponent.selectSubMenuSection(subMenuItem);
        return this;
    }

    public NavigateToProductPageFacade selectFilter(String filterValue)
    {
        productdisplayPage.selectBrandFilterOption(filterValue);
        return this;
    }
    public NavigateToProductPageFacade selectSortByOptionHighToLow()
    {
        productdisplayPage.selectSortByOptionHighToLow();
        return this;
    }

    public NavigateToProductPageFacade selectNthLargestItem(String numberOfItem)
    {
        productdisplayPage.selectNthLargest("2");
        return this;
    }
}
