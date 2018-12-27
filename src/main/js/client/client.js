import React from 'react'
import { hydrate } from 'react-dom'
import { BrowserRouter } from 'react-router-dom'
import Routes from './Routes'

const Router = () =>
  <BrowserRouter>
    <Routes/>
  </BrowserRouter>

hydrate(<Router/>, document.getElementById('root'))