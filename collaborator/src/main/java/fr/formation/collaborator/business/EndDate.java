package fr.formation.collaborator.business;

import java.time.LocalDate;

public class EndDate {

    private LocalDate end;

    public EndDate() {
    }

    public LocalDate getEnd() {
	return end;
    }

    public void setEnd(LocalDate end) {
	this.end = end;
    }

    @Override
    public String toString() {
	return "EndDate [end=" + end + "]";
    }
}
