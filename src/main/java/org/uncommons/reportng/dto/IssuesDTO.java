package org.uncommons.reportng.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssuesDTO {

	private Map<String, List<IssueDTO>> newIssues;
	private Map<String, List<IssueDTO>> newIssuesRegression;
	private Map<String, List<IssueDTO>> newIssuesNewFeature;
	private Map<String, List<IssueDTO>> fixedIssues;
	private Map<String, List<IssueDTO>> fixedIssuesRegression;
	private Map<String, List<IssueDTO>> fixedIssuesNewFeature;
	private Map<String, List<IssueDTO>> knownIssues;
	private Map<String, List<IssueDTO>> knownIssuesRegression;
	private Map<String, List<IssueDTO>> knownIssuesNewFeature;

	private int newIssuesAmount;
	private int fixedIssuesAmount;
	private int knownIssuesAmount;

	private Map<String, List<IssueDTO>> newFeature;
	private Map<String, List<IssueDTO>> feature;

	public IssuesDTO() {
		newIssues = new HashMap<String, List<IssueDTO>>();
		fixedIssues = new HashMap<String, List<IssueDTO>>();
		knownIssues = new HashMap<String, List<IssueDTO>>();
		newFeature = new HashMap<String, List<IssueDTO>>();
		feature = new HashMap<String, List<IssueDTO>>();
		newIssuesRegression = new HashMap<String, List<IssueDTO>>();
		newIssuesNewFeature = new HashMap<String, List<IssueDTO>>();
		knownIssuesRegression = new HashMap<String, List<IssueDTO>>();
		knownIssuesNewFeature = new HashMap<String, List<IssueDTO>>();
		fixedIssuesRegression = new HashMap<String, List<IssueDTO>>();
		fixedIssuesNewFeature = new HashMap<String, List<IssueDTO>>();
	}

	public Map<String, List<IssueDTO>> getNewIssues() {
		return newIssues;
	}

	public void setNewIssues(Map<String, List<IssueDTO>> newIssues) {
		this.newIssues = newIssues;
	}

	public Map<String, List<IssueDTO>> getFixedIssues() {
		return fixedIssues;
	}

	public void setFixedIssues(Map<String, List<IssueDTO>> fixedIssues) {
		this.fixedIssues = fixedIssues;
	}

	public Map<String, List<IssueDTO>> getKnownIssues() {
		return knownIssues;
	}

	public void setKnownIssues(Map<String, List<IssueDTO>> knownIssues) {
		this.knownIssues = knownIssues;
	}

	public int getNewIssuesAmount() {
		return newIssuesAmount;
	}

	public void setNewIssuesAmount(int newIssuesAmount) {
		this.newIssuesAmount = newIssuesAmount;
	}

	public int getFixedIssuesAmount() {
		return fixedIssuesAmount;
	}

	public void setFixedIssuesAmount(int fixedIssuesAmount) {
		this.fixedIssuesAmount = fixedIssuesAmount;
	}

	public int getKnownIssuesAmount() {
		return knownIssuesAmount;
	}

	public void setKnownIssuesAmount(int knownIssuesAmount) {
		this.knownIssuesAmount = knownIssuesAmount;
	}

	public Map<String, List<IssueDTO>> getNewFeature() {
		return newFeature;
	}

	public void setNewFeature(Map<String, List<IssueDTO>> newFeature) {
		this.newFeature = newFeature;
	}

	public Map<String, List<IssueDTO>> getFeature() {
		return feature;
	}

	public void setFeature(Map<String, List<IssueDTO>> feature) {
		this.feature = feature;
	}

	public Map<String, List<IssueDTO>> getNewIssuesRegression() {
		return newIssuesRegression;
	}

	public void setNewIssuesRegression(Map<String, List<IssueDTO>> newIssuesRegression) {
		this.newIssuesRegression = newIssuesRegression;
	}

	public Map<String, List<IssueDTO>> getNewIssuesNewFeature() {
		return newIssuesNewFeature;
	}

	public void setNewIssuesNewFeature(Map<String, List<IssueDTO>> newIssuesNewFeature) {
		this.newIssuesNewFeature = newIssuesNewFeature;
	}

	public Map<String, List<IssueDTO>> getKnownIssuesRegression() {
		return knownIssuesRegression;
	}

	public void setKnownIssuesRegression(Map<String, List<IssueDTO>> knownIssuesRegression) {
		this.knownIssuesRegression = knownIssuesRegression;
	}

	public Map<String, List<IssueDTO>> getKnownIssuesNewFeature() {
		return knownIssuesNewFeature;
	}

	public void setKnownIssuesNewFeature(Map<String, List<IssueDTO>> knownIssuesNewFeature) {
		this.knownIssuesNewFeature = knownIssuesNewFeature;
	}

	public Map<String, List<IssueDTO>> getFixedIssuesRegression() {
		return fixedIssuesRegression;
	}

	public void setFixedIssuesRegression(Map<String, List<IssueDTO>> fixedIssuesRegression) {
		this.fixedIssuesRegression = fixedIssuesRegression;
	}

	public Map<String, List<IssueDTO>> getFixedIssuesNewFeature() {
		return fixedIssuesNewFeature;
	}

	public void setFixedIssuesNewFeature(Map<String, List<IssueDTO>> fixedIssuesNewFeature) {
		this.fixedIssuesNewFeature = fixedIssuesNewFeature;
	}

}
