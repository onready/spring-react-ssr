import React from 'react'
import { Route, Switch } from 'react-router-dom'
import Home from './pages/Home'
import Contact from './pages/Contact'

export default () =>
  <Switch>
    <Route path='/' exact component={Home}/>
    <Route path='/contact' exact component={Contact}/>
  </Switch>