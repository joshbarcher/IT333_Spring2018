package bags;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Contact implements Iterable<String>
{
    private String firstName;
    private String lastName;
    private String fullAddress;
    private String phoneNumber;

    public Contact(String firstName, String lastName,
                   String fullAddress, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullAddress = fullAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullAddress()
    {
        return fullAddress;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    @Override
    public String toString()
    {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public Iterator<String> iterator()
    {
        return new ContactIterator();
    }

    private class ContactIterator implements Iterator<String>
    {
        private boolean nameDone;
        private boolean addressDone;
        private boolean phoneNumberDone;

        @Override
        public boolean hasNext()
        {
            return !phoneNumberDone;
        }

        @Override
        public String next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException("Iterator has no more elements");
            }

            String result = "";
            if (!nameDone)
            {
                result = firstName + " " + lastName;
                nameDone = true;
            }
            else if (!addressDone)
            {
                result = fullAddress;
                addressDone = true;
            }
            else
            {
                result = phoneNumber;
                phoneNumberDone = true;
            }

            return result;
        }
    }
}
