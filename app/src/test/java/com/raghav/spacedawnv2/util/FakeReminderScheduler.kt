package com.raghav.spacedawnv2.util

import com.raghav.spacedawnv2.domain.model.LaunchDetail
import com.raghav.spacedawnv2.domain.util.ReminderScheduler
import com.raghav.spacedawnv2.domain.util.ReminderState

class FakeReminderScheduler : ReminderScheduler {
    override fun setReminder(launchDetail: LaunchDetail): ReminderState {
        return ReminderState.SetSuccessfully
    }

    override fun cancelReminder(id: String) {
    }
}