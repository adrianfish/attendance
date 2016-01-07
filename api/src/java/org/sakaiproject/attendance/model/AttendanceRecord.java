/*
 *  Copyright (c) 2015, The Apereo Foundation
 *
 *  Licensed under the Educational Community License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *              http://opensource.org/licenses/ecl2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.sakaiproject.attendance.model;

import lombok.*;

import java.util.Objects;


/**
 * Created by Leonardo Canessa [lcanessa1 (at) udayton (dot) edu]
 */
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceRecord {
    @Getter @Setter private Long    id;
    @Getter @Setter private AttendanceEvent attendanceEvent;
    @Getter @Setter private String  userID;
    @Getter @Setter private Status  status;

    public AttendanceRecord(AttendanceEvent e, String uId, Status s) {
        this.attendanceEvent = e;
        this.userID = uId;
        this.status = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendanceRecord that = (AttendanceRecord) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(attendanceEvent, that.attendanceEvent) &&
                Objects.equals(userID, that.userID) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
