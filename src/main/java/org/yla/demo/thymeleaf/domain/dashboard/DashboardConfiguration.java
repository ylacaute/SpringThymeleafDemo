package org.yla.demo.thymeleaf.domain.dashboard;

import java.util.List;

public class DashboardConfiguration {

	private List<DashboardLine> lines;

	public List<DashboardLine> getLines() {
		return lines;
	}

	public void setLines(List<DashboardLine> lines) {
		this.lines = lines;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName())
			.append("{ nbLines:").append(lines.size());
		for (DashboardLine dashboardLine : lines) {
			builder.append("[nbContainers:").append(dashboardLine.getContainers().size()).append("]");
		}
		return builder.append("}").toString();
	}
	
}

class DashboardLine {
	
	private List<DashboardLineContainer> containers;

	public List<DashboardLineContainer> getContainers() {
		return containers;
	}

	public void setContainers(List<DashboardLineContainer> containers) {
		this.containers = containers;
	}

}

class DashboardLineContainer {
	
	private String cssClass;

	private List<DashboardWidget> widgets;
	
	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	public List<DashboardWidget> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<DashboardWidget> widgets) {
		this.widgets = widgets;
	}
	
}


class DashboardWidget {
	
	private String fragmentUri;

	public String getFragmentUri() {
		return fragmentUri;
	}

	public void setFragmentUri(String fragmentUri) {
		this.fragmentUri = fragmentUri;
	}
	
}



