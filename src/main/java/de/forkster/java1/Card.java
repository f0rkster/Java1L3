package de.forkster.java1;

public class Card {

    public Card(String _Color, int _Value)
    {
        this.value = _Value;
        this.color = _Color;
    }

    private String status = "Deck";
    private String color = null;
    private int value = 0;


    public String getStatus ()
    {
        return status;
    }
    public void setStatus (String _status)
    {
        this.status = _status;
    }

    public String getColor ()
    {
        return color;
    }
    public void setColor (String _color)
    {
        this.color = _color;
    }

    public int getValue ()
    {
        return value;
    }
    public void setValue ( int _value)
    {
        this.value = _value;
    }
}
