package com.rbkmoney.adapter.bank.spring.boot.starter.flow;

import com.rbkmoney.adapter.bank.spring.boot.starter.model.EntryStateModel;
import com.rbkmoney.adapter.bank.spring.boot.starter.model.ExitStateModel;
import com.rbkmoney.adapter.bank.spring.boot.starter.model.Step;

public interface StepResolver<T extends EntryStateModel, R extends ExitStateModel>  {

    Step resolveEntry(T stateModel);

    Step resolveExit(R stateModel);

}
