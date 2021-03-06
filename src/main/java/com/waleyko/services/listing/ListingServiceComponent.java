package com.waleyko.services.listing;

public class ListingServiceComponent {

    ListingDAO theDAO;

    public ListingServiceComponent(ListingDAO aDAO)
    {
        theDAO = aDAO;
    }

    public boolean createListing(Listing aListing)
    {
        return theDAO.insert(aListing);
    }

    public boolean deleteListing(String anId)
    {
        return theDAO.delete(anId);
    }

    public Listing getListingById(String anId)
    {
        return theDAO.getListingById(anId);
    }
}
