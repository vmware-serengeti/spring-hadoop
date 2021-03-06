/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.yarn.am.grid;

import java.util.Collection;

import org.springframework.yarn.am.grid.support.ProjectionData;
import org.springframework.yarn.am.grid.support.SatisfyStateData;

/**
 * Interface representing a grid projection.
 *
 * @author Janne Valkealahti
 *
 */
public interface GridProjection {

	boolean acceptMember(GridMember member);

	/**
	 * Removes the member.
	 *
	 * @param member the member
	 * @return the grid member
	 */
	GridMember removeMember(GridMember member);

	/**
	 * Gets the members of this projection as {@code Collection}.
	 *
	 * @return the projection members
	 */
	Collection<GridMember> getMembers();

	/**
	 * Gets the satisfy state.
	 *
	 * @return the satisfy state
	 */
	SatisfyStateData getSatisfyState();

	/**
	 * Sets the projection data.
	 *
	 * @param data the new projection data
	 */
	void setProjectionData(ProjectionData data);

	/**
	 * Gets the projection data.
	 *
	 * @return the projection data
	 */
	ProjectionData getProjectionData();

}
