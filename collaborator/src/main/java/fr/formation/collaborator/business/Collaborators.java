package fr.formation.collaborator.business;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Collaborators {

    private Long id;

    @NotEmpty
    @Size(max = 10)
    private String personalId;

    @NotEmpty
    @Size(min = 1, max = 150)
    private String lastName;

    @NotEmpty
    @Size(min = 1, max = 150)
    private String firstName;

    @NotNull
    @Past
    private LocalDate date;

    @NotNull
    @PastOrPresent
    private LocalDate start;

    @NotNull
    @Positive
    private double salary;

    private LocalDate end;

    public Collaborators() {
    }

    public Collaborators(String personalId, String lastName, String firstName,
	    LocalDate date, LocalDate start, double salary, LocalDate end) {
	this.personalId = personalId;
	this.lastName = lastName;
	this.firstName = firstName;
	this.date = date;
	this.start = start;
	this.salary = salary;
	this.end = end;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getPersonalId() {
	return personalId;
    }

    public void setPersonalId(String personalId) {
	this.personalId = personalId;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public LocalDate getStart() {
	return start;
    }

    public void setStart(LocalDate start) {
	this.start = start;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public LocalDate getEnd() {
	return end;
    }

    public void setEnd(LocalDate end) {
	this.end = end;
    }

    @Override
    public String toString() {
	return "Collaborators [id=" + id + ", personalId=" + personalId
		+ ", lastName=" + lastName + ", firstName=" + firstName
		+ ", date=" + date + ", start=" + start + ", salary=" + salary
		+ ", end=" + end + "]";
    }
}
