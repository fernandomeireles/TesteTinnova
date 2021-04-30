package br.com.teste.tinnova.model;

import java.io.Serializable;

public class ElectionRequest implements Serializable {

    private static final long serialVersionUID = -8892122595801487535L;

    private int totalVoters;
    private int validVotes;
    private int blankVotes;
    private int nullVotes;

    public ElectionRequest(int totalVoters, int validVotes, int blankVotes, int nullVotes) {
        setTotalVoters(totalVoters);
        setBlankVotes(blankVotes);
        setNullVotes(nullVotes);
        setValidVotes(validVotes);
    }

    public int getTotalVoters() {
        return totalVoters;
    }

    public void setTotalVoters(int totalVoters) {
        this.totalVoters = totalVoters;
    }

    public int getValidVotes() {
        return validVotes;
    }

    public void setValidVotes(int validVotes) {
        this.validVotes = validVotes;
    }

    public int getBlankVotes() {
        return blankVotes;
    }

    public void setBlankVotes(int blankVotes) {
        this.blankVotes = blankVotes;
    }

    public int getNullVotes() {
        return nullVotes;
    }

    public void setNullVotes(int nullVotes) {
        this.nullVotes = nullVotes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + blankVotes;
        result = prime * result + nullVotes;
        result = prime * result + totalVoters;
        result = prime * result + validVotes;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ElectionRequest other = (ElectionRequest) obj;
        if (blankVotes != other.blankVotes)
            return false;
        if (nullVotes != other.nullVotes)
            return false;
        if (totalVoters != other.totalVoters)
            return false;
        if (validVotes != other.validVotes)
            return false;
        return true;
    }

}
